let id = document.getElementById('id');
        let pw = document.getElementById('password');
        let pw_re = document.getElementById('password_re');
        let nickname = document.getElementById('nickname');

        const btn = document.querySelector(`.btn-input`);
        const inputs = document.querySelectorAll(`.text-field`);
        let trg0 = false;
        let trg1 = false;
        let trg2 = false;
        let trg3 = false;

        inputs[0].addEventListener('input', () => {     //아이디 영역
            let id_reg = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{4,20}$/.test(id.value);
            if (id_reg) {
                id.style.borderColor='green';
                document.getElementById('id_text').innerHTML=`사용 가능한 아이디입니다`;
                document.getElementById('id_text').style.color='green';
                trg0=true;
            }
            else {
                id.style.borderColor='red';
                document.getElementById('id_text').innerHTML=`아이디 조건에 맞지않습니다`;
                document.getElementById('id_text').style.color='red';
                trg0=false;
                }
        })

        inputs[1].addEventListener('input', () => { // 닉네임 영역
            let nickname_reg = /^[ㄱ-ㅎ가-힣a-zA-Z0-9]{2,20}$/.test(nickname.value);
            if (nickname_reg) {
                nickname.style.borderColor='green';
                document.getElementById('nickname_text').innerHTML=`사용 가능한 닉네임입니다`;
                document.getElementById('nickname_text').style.color='green';
                trg1=true;
            }
            else {
                nickname.style.borderColor='red';
                document.getElementById('nickname_text').innerHTML=`닉네임 조건에 맞지않습니다`;
                document.getElementById('nickname_text').style.color='red';
                trg1=false;
                }
        })

        inputs[2].addEventListener('input', () => {     // 비밀번호 영역
            let pw_reg = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{4,20}$/.test(pw.value);
            if(pw_reg){
                pw.style.borderColor='green';
                document.getElementById('pw_text').innerHTML=`사용 가능한 비밀번호입니다`;
                document.getElementById('pw_text').style.color='green';
                trg2=true;
            }
            else{
                pw.style.borderColor='red';
                document.getElementById('pw_text').innerHTML=`비밀번호 조건에 맞지않습니다`;
                document.getElementById('pw_text').style.color='red';
                trg2=false;
            }
        })

        inputs[3].addEventListener('input', () => {     // 비밀번호 재입력 영역
            let pw_re_reg = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{4,20}$/.test(pw_re.value);
            if(pw_re_reg && (pw_re.value==pw.value)){
                pw_re.style.borderColor='green';
                document.getElementById('pw_re_text').innerHTML=`비밀번호 일치 확인`;
                document.getElementById('pw_re_text').style.color='green';
                trg3=true;
            }
            else{
                pw_re.style.borderColor='red';
                document.getElementById('pw_re_text').innerHTML=`비밀번호와 다릅니다`;
                document.getElementById('pw_re_text').style.color='red';
                trg3=false;
            }

            if(trg0 && trg1 && trg2 && trg3){
                btn.style.backgroundColor='rgb(0, 132, 255)';
                btn.style.color='white';
            }
            else{
                btn.style.backgroundColor='rgba(107, 182, 252, 0.8)';
                btn.style.color='black';
            }
        })

        function toHome(){
            if(trg0 && trg1 && trg2){
                alert('회원가입이 완료되었습니다.');
                location.href=`main.html?id=${id.value}&password=${password.value}`;
            }
        }