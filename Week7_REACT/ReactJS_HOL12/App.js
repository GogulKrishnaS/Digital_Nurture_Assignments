import React from "react";

function GuestPage() {
  const flightDetails = [
    { id: "AI-202", from: "Chennai", to: "Delhi", time: "08:00 AM" },
    { id: "6E-555", from: "Mumbai", to: "Bangalore", time: "10:30 AM" },
    { id: "UK-820", from: "Delhi", to: "Kolkata", time: "01:15 PM" },
  ];

  const pageStyle = { padding: "20px", backgroundColor: "#f0f8ff" };
  const listStyle = { listStyleType: "none", padding: 0 };
  const flightItemStyle = {
    background: "#fff",
    border: "1px solid #ddd",
    padding: "15px",
    margin: "10px 0",
    borderRadius: "8px",
  };

  return (
    <div style={pageStyle}>
      <h2>Available Flights (Guest View)</h2>
      <p>Please log in to book a ticket.</p>
      <ul style={listStyle}>
        {flightDetails.map((flight) => (
          <li key={flight.id} style={flightItemStyle}>
            <strong>{flight.id}</strong>: {flight.from} to {flight.to} at{" "}
            {flight.time}
          </li>
        ))}
      </ul>
    </div>
  );
}

function UserPage() {
  const pageStyle = { padding: "20px", backgroundColor: "#e6fffa" };
  const headingStyle = { color: "#00796b" };

  return (
    <div style={pageStyle}>
      <h2 style={headingStyle}>Welcome, User!</h2>
      <p>You can now book your tickets.</p>
      <button
        style={{ padding: "10px 20px", fontSize: "16px", cursor: "pointer" }}
      >
        Book Now
      </button>
    </div>
  );
}

class TicketBookingApp extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false,
    };
  }

  handleLogin = () => {
    this.setState({ isLoggedIn: true });
  };

  handleLogout = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {
    const { isLoggedIn } = this.state;

    const appStyle = {
      fontFamily: "Arial, sans-serif",
      textAlign: "center",
      maxWidth: "800px",
      margin: "20px auto",
      boxShadow: "0 4px 12px rgba(0,0,0,0.1)",
      borderRadius: "10px",
      overflow: "hidden",
    };

    const headerStyle = {
      backgroundColor: "#4a90e2",
      color: "white",
      padding: "20px",
    };

    const buttonStyle = {
      padding: "10px 20px",
      fontSize: "16px",
      cursor: "pointer",
      border: "none",
      borderRadius: "5px",
      backgroundColor: "#333",
      color: "white",
      margin: "20px",
    };

    return (
      <div style={appStyle}>
        <div style={headerStyle}>
          <h1>Flight Ticket Booking</h1>
        </div>

        {isLoggedIn ? <UserPage /> : <GuestPage />}

        {isLoggedIn ? (
          <button style={buttonStyle} onClick={this.handleLogout}>
            Logout
          </button>
        ) : (
          <button style={buttonStyle} onClick={this.handleLogin}>
            Login
          </button>
        )}
      </div>
    );
  }
}

export default TicketBookingApp;
