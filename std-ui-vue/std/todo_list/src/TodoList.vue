<template>
  <div>
    <img src="./assets/logo.png">
    <input v-model="inputValue"/>
    <button @click="submitValue">提交</button><!-- v-on:click @click-->
    <div>
      <ul>
        <!--<li v-for="(item,idx) of dataList" :key="idx">{{idx}} : {{item}}</li>-->
        <todo-item
          v-for="(item,idx) of dataList"
          :content="item"
          :index="idx"
          :key="idx"
          @delete_event="deleteValue"
        >
        </todo-item> <!-- 3.使用组件 --><!-- 1.父组件向子组件传值：设置传值参数 --><!-- 3.子组件向向组件传播事件：注册事件 @delete_event-->
      </ul>
    </div>
  </div>
</template>

<script>
  import  TodoItem from './components/TodoItem' //1.导入组件
  export default {
    name: "TodoList",
    components:{//2.定义组件
      "todo-item":TodoItem
    },
    data() {
      return {
        inputValue: '',
        dataList: []
      }
    },
    methods:{
      submitValue(){
        this.dataList.push(this.inputValue)
        this.inputValue = ''
      },
      deleteValue(index){
        this.dataList.splice(index,1)
      }
    }
  }
</script>

<style scoped>

</style>
