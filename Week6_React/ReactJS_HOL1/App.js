import React from "react";

function App() {
  const appHeaderStyles = {
    backgroundColor: "#222",
    minHeight: "100vh",
    display: "flex",
    flexDirection: "column",
    alignItems: "center",
    justifyContent: "center",
    fontSize: "calc(10px + 2vmin)",
    color: "white",
    textAlign: "center",
  };
  return (
    <div style={appHeaderStyles}>
      <header>
        <h1>welcome to the first session of React</h1>
      </header>
    </div>
  );
}
export default App;
