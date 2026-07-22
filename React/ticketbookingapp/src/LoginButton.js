import React from 'react';

function LoginButton(props) {

  return (
    <button onClick={props.onLogin}>
      Login
    </button>
  );
}

export default LoginButton;