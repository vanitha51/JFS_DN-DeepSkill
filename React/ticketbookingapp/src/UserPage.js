import React from 'react';
import LogoutButton from './LogoutButton';
import FlightDetails from './FlightDetails';

function UserPage(props) {

  return (
    <div style={{ margin: '20px' }}>

      <h1>Welcome User</h1>

      <FlightDetails />

      <h2 style={{ color: 'green' }}>
        Ticket Booking Available
      </h2>

      <button>Book Ticket</button>

      <br />
      <br />

      <LogoutButton onLogout={props.onLogout} />

    </div>
  );
}

export default UserPage;