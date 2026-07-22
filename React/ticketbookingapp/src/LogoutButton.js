import React from 'react';

function LogoutButton(props) {

  return (
    <button onClick={props.onLogout}>
      Logout
    </button>
  );
}

export default LogoutButton;