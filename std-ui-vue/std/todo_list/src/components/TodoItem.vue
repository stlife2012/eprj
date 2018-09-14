<template>
  <!--<ul>-->
    <!--<li v-for="(item,idx) in content" :key="idx" @click="removeItem">{{idx}} : {{item}}</li>&lt;!&ndash; 1.父组件向子组件传值：使用 &ndash;&gt;-->
  <!--</ul>-->
  <li @click="deleteEvent">{{index}} -> {{content}}</li><!--3.父组件向子组件传值：使用-->
  <!--1.子组件向向组件传播事件：绑定事件-->
</template>

<script>
  export default {
    name: "TodoItem",
    props:['content','index'],//2.父组件向子组件传值：绑定
    data() {
      return ""
    },
    methods:{
      deleteEvent(){//1.子组件向向组件传播事件：注册事件
        this.$emit('delete_event',this.index)
      }
    }
  }
</script>

<style scoped>

</style>
