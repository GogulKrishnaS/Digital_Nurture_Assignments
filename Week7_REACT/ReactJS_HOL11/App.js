import React, { useState } from "react";

class EventExamplesApp extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0,
    };
  }

  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
  };

  sayHello = () => {
    alert("Hello! This is the second method.");
  };

  handleIncrement = () => {
    this.increment();
    this.sayHello();
  };

  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  };

  saySomething = (message) => {
    alert(message);
  };

  handlePress = () => {
    alert("I was clicked");
  };

  render() {
    const buttonStyle = {
      margin: "5px",
      padding: "10px 15px",
      fontSize: "16px",
      cursor: "pointer",
      borderRadius: "5px",
      border: "1px solid #ccc",
    };

    return (
      <div>
        <h2>Counter: {this.state.counter}</h2>
        <button style={buttonStyle} onClick={this.handleIncrement}>
          Increment
        </button>
        <button style={buttonStyle} onClick={this.decrement}>
          Decrement
        </button>
        <button
          style={buttonStyle}
          onClick={() => this.saySomething("Welcome")}
        >
          Say Welcome
        </button>
        <button style={buttonStyle} onClick={this.handlePress}>
          OnPress
        </button>
      </div>
    );
  }
}

function CurrencyConvertor() {
  const [inr, setInr] = useState("");
  const [eur, setEur] = useState(0);

  const handleInrChange = (event) => {
    setInr(event.target.value);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    const convertedEur = parseFloat(inr) / 90.0; // Approximate conversion rate
    setEur(convertedEur);
  };

  const formStyle = {
    marginTop: "20px",
    padding: "20px",
    border: "1px solid #ddd",
    borderRadius: "8px",
  };

  const inputStyle = {
    padding: "8px",
    marginRight: "10px",
    fontSize: "16px",
  };

  const buttonStyle = {
    padding: "10px 15px",
    fontSize: "16px",
    cursor: "pointer",
  };

  return (
    <div style={formStyle}>
      <h2>Currency Converter</h2>
      <form onSubmit={handleSubmit}>
        <label>
          INR:
          <input
            type="number"
            value={inr}
            onChange={handleInrChange}
            style={inputStyle}
          />
        </label>
        <button type="submit" style={buttonStyle}>
          Convert
        </button>
      </form>
      <h3>EUR: {eur.toFixed(2)}</h3>
    </div>
  );
}

function App() {
  const appStyle = {
    fontFamily: "Arial, sans-serif",
    padding: "30px",
    textAlign: "center",
    maxWidth: "600px",
    margin: "auto",
    boxShadow: "0 4px 8px rgba(0,0,0,0.1)",
    borderRadius: "10px",
  };

  const headerStyle = {
    borderBottom: "2px solid #eee",
    paddingBottom: "15px",
    marginBottom: "20px",
  };

  return (
    <div style={appStyle}>
      <h1 style={headerStyle}>Event Handling Examples</h1>
      <EventExamplesApp />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
