import React from "react";

function Home() {
  const style = {
    padding: "20px",
    border: "1px solid #ddd",
    borderRadius: "8px",
    margin: "10px 0",
    backgroundColor: "#f9f9f9",
  };
  return (
    <div style={style}>
      <h2>Welcome to the Home page of Student Management Portal</h2>
    </div>
  );
}

function About() {
  const style = {
    padding: "20px",
    border: "1px solid #ddd",
    borderRadius: "8px",
    margin: "10px 0",
    backgroundColor: "#f0f8ff",
  };
  return (
    <div style={style}>
      <h2>Welcome to the About page of the Student Management Portal</h2>
    </div>
  );
}

function Contact() {
  const style = {
    padding: "20px",
    border: "1px solid #ddd",
    borderRadius: "8px",
    margin: "10px 0",
    backgroundColor: "#fffacd",
  };
  return (
    <div style={style}>
      <h2>Welcome to the Contact page of the Student Management Portal</h2>
    </div>
  );
}

function StudentApp() {
  const appStyle = {
    fontFamily: "Arial, sans-serif",
    textAlign: "center",
    padding: "40px",
    backgroundColor: "#eef",
    minHeight: "100vh",
  };

  const headerStyle = {
    color: "#333",
    borderBottom: "2px solid #ccc",
    paddingBottom: "10px",
    marginBottom: "30px",
  };

  return (
    <div style={appStyle}>
      <h1 style={headerStyle}>Student Management Portal</h1>
      <Home />
      <About />
      <Contact />
    </div>
  );
}

export default StudentApp;
