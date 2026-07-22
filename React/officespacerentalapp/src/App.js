import React from "react";
import office from "./office.webp";

function App() {

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    }
  ];

  return (
    <div style={{ marginLeft: "30px" }}>

      <h1>Office Space Rental App</h1>

      <img
        src={office}
        alt="Office Space"
        width="500"
        height="300"
      />

      <br /><br />

      {officeList.map((office, index) => (
        <div key={index}>

          <h2>Name : {office.Name}</h2>

          <h3
            style={{
              color: office.Rent < 60000 ? "red" : "green"
            }}
          >
            Rent : Rs. {office.Rent}
          </h3>

          <h3>Address : {office.Address}</h3>

          <hr />

        </div>
      ))}

    </div>
  );
}

export default App;