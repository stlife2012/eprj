import React,{Component} from 'react'

class TodoItem extends Component{
    constructor(props) {
        super(props);
        this.handlerDelete = this.handlerDelete.bind(this);
        // index = this.props.index;
    }


    handlerDelete(){
        console.log(this.props.index)
        const {eventDelete,index} = this.props; //代码优化，可以提升执行效率
        eventDelete(index)    //eventDelete 2.调用父组件的事件方法
    }
    render(){
        const {content} = this.props;   //代码优化，可以提升执行效率
        return <div onClick={this.handlerDelete}>{content}</div>
    }
}

export default TodoItem;