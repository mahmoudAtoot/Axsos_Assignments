function toggleLogin(button) {
    if (button.className === 'login-button') {
        button.className = 'logout-button';
        button.textContent = 'Logout';
    } else {
        button.className = 'login-button';
        button.textContent = 'Login';
    }
}


function removeButton(button) {
    button.remove();  
}


function likeNinja() {
    alert('Ninja was liked');
}