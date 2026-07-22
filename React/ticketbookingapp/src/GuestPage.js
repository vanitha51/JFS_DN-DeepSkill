import React from 'react';
import LoginButton from './LoginButton';
import FlightDetails from './FlightDetails';

function GuestPage(props) {

  return (
    <div style={{ margin: '20px' }}>

      <h1>Welcome Guest</h1>

      <FlightDetails />

      <h3>Please login to book tickets.</h3>

      <LoginButton onLogin={props.onLogin} />

    </div>
  );
}

export default GuestPage;