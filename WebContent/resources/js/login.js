var login={
		login:function(){
			var loginDialog=$("#loginDialog");
			loginDialog.focus();
			loginDialog.dialog({
				 title: '登陆',
				 width: 300,
				 height: 200,
				 closed: false,
				 cache: false,
				 modal: true,
				 collapsible:true,
				 closable:false,
				 buttons:[
				          {
				        	  text:'登陆',
				        	  handler:function(){
				        		  $.ajax({
				        			  url:'login.xhtml',
				        			  dataType:'json',
				        			  data:{
				        				  userName:$("#loginForm table input[name=userName]").val(),
				        				  password:$("#loginForm table input[name=password]").val()
				        			  },
				        			  type:'post',
				        			  cache:false,
				        			  success:function(r){
				        				  console.info(r.msg);
				        			  }
				        		  });
				        	  }
				          },
				          {
				        	  text:'注册',
				        	  handler:function(){
				        		  alert("2");
				        	  }
				          }
				          ]
			});
		}
};