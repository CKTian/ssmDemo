var vm =new Vue({
	el:"#test",
	data:{
		user:{
			username:"",
			pwd:""
		}
	},
	methods:{
		login:function(){
			$.ajax({
				url:'TestController/test.do',
				data:this.user,
				type:'post',
				dataType:'text',
				success:function(result){
					if(result==1){
						alert("登录成功");
					}
					alert(vm.user.username);
				},
				error:function(result){
					alert("登录失败");
				}
			});
		}
	}
});