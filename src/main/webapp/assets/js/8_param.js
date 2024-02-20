document.getElementById('search').addEventListener('click', function(){
	const name = document.getElementById('name').value;
	const age = document.querySelector('#age').value;
	
	console.log('입력값 : ', name, age);
	
	//location.href='6_selectBy.jsp?name=김사나&age=23'
	location.href=`6_selectBy.jsp?name=${name}&age=${age}`
})
//js 파일은 8_param_js.jsp 에 포함되므로 8번 jsp파일과 같은 폴더입니다.