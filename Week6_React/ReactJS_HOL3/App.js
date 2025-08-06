import React from "react";

function CalculateScore({ name, school, total, goal }) {
  const average = total / goal;

  const cardStyle = {
    border: "1px solid #ccc",
    borderRadius: "10px",
    padding: "25px",
    margin: "20px auto",
    maxWidth: "400px",
    boxShadow: "0 4px 8px rgba(0,0,0,0.1)",
    fontFamily: "Arial, sans-serif",
    backgroundColor: "#f9f9f9",
  };

  const headerStyle = {
    color: "#333",
    borderBottom: "2px solid #eee",
    paddingBottom: "10px",
    marginBottom: "20px",
  };

  const pStyle = {
    fontSize: "1.1em",
    color: "#555",
    lineHeight: "1.6",
  };

  const strongStyle = {
    color: "#000",
  };

  return (
    <div style={cardStyle}>
      <h2 style={headerStyle}>Student Score Details</h2>
      <p style={pStyle}>
        <strong style={strongStyle}>Name:</strong> {name}
      </p>
      <p style={pStyle}>
        <strong style={strongStyle}>School:</strong> {school}
      </p>
      <p style={pStyle}>
        <strong style={strongStyle}>Total Marks:</strong> {total}
      </p>
      <p style={pStyle}>
        <strong style={strongStyle}>Number of Subjects:</strong> {goal}
      </p>
      <h3 style={{ color: "#0056b3" }}>Average Score: {average.toFixed(2)}</h3>
    </div>
  );
}

function ScoreCalculatorApp() {
  const appContainerStyle = {
    textAlign: "center",
    paddingTop: "30px",
    backgroundColor: "#eef",
    minHeight: "100vh",
  };

  return (
    <div style={appContainerStyle}>
      <CalculateScore
        name="Jane Doe"
        school="Central High School"
        total={455}
        goal={5}
      />
      <CalculateScore
        name="John Smith"
        school="Northwood Academy"
        total={380}
        goal={5}
      />
    </div>
  );
}

export default ScoreCalculatorApp;
