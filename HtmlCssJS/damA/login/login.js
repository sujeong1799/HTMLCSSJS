function match(){
    let id = document.getElementById('id').value;
    let pw = document.getElementById('password').value;

    // shoppingbasket.html?product_name=apple&product_amount=3&product_price=15000&
    // product_name=banana&product_amount=2&product_price=25000
    // 이름, 구매수량, 값 보내야함

    if(id=='admin' && pw=='admin'){
        location.href=`main.html?id=admin&password=admin`;
    }
    else if(id=='admin' && pw!='admin'){
        alert('비밀번호가 틀립니다');
    }
    else{
        alert('입력된 아이디 혹은 비밀번호가 올바르지않습니다');
    }
}

function account(){
    location.href='memberjoin.html';
}