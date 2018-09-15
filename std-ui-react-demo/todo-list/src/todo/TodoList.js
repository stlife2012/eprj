import React, {Component} from 'react';
import TodoItem from './TodoItem';

import '../App.css';

class TodoList extends Component {
    constructor(props){
        super(props);
        this.state = {
            list:[],
            inputValue:''
        };
        this.handlerDeleteByIdx = this.handlerDeleteByIdx.bind(this);//代码优化，可以提升执行效率
        this.handlerOnChanager = this.handlerOnChanager.bind(this);
        this.handlerOnClick = this.handlerOnClick.bind(this);
    }

    handlerOnChanager(e){
        this.setState({
            inputValue:e.target.value
        })
    }
    handlerOnClick(e){
        this.setState({
            list:[...this.state.list,this.state.inputValue],
            inputValue:''
        })
    }

    handlerDeleteByIdx(idx){
        console.log('idx=>' + idx);
        const list = [...this.state.list];//对state中的数据操作建议先复制出来再进行修改有利于调试
        list.splice(idx,1);
        this.setState({//如果key与值得变量名称一致，key减写为this.setState({list})
            list:list
        })
    }

    todoItemList(){
        return this.state.list.map((item,idx)=>{
            // return <li key={idx} onClick={this.handlerDeleteByIdx.bind(this,idx)}>{item}</li>
            //eventDelete 1.将删除事件绑定到子组件的属性上
            return <TodoItem content={item} key={idx} index={idx} eventDelete={this.handlerDeleteByIdx}/>
        })
    }
    render() {
        return (
            <div className="App">
                <div>
                    <input value={this.state.inputValue} onChange={this.handlerOnChanager}/>
                    <button onClick={this.handlerOnClick}>Submit</button>
                </div>
                <div>
                    <ul>{this.todoItemList()}</ul>
                </div>
            </div>
        );
    }
}

export default TodoList;
