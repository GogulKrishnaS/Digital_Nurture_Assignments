import React from "react";

function ListOfPlayers() {
  const players = [
    { name: "Player 1", score: 85 },
    { name: "Player 2", score: 65 },
    { name: "Player 3", score: 92 },
    { name: "Player 4", score: 45 },
    { name: "Player 5", score: 110 },
    { name: "Player 6", score: 58 },
    { name: "Player 7", score: 75 },
    { name: "Player 8", score: 68 },
    { name: "Player 9", score: 102 },
    { name: "Player 10", score: 33 },
    { name: "Player 11", score: 95 },
  ];

  const playersWithLowScores = players.filter((player) => player.score < 70);

  const listStyle = { listStyleType: "none", padding: 0 };
  const listItemStyle = {
    background: "#f4f4f4",
    border: "1px solid #ddd",
    padding: "8px",
    margin: "5px 0",
  };

  return (
    <div>
      <h2>List of All Players</h2>
      <ul style={listStyle}>
        {players.map((player, index) => (
          <li key={index} style={listItemStyle}>
            {player.name} - Score: {player.score}
          </li>
        ))}
      </ul>

      <h2>Players with Scores Below 70</h2>
      <ul style={listStyle}>
        {playersWithLowScores.map((player, index) => (
          <li key={index} style={listItemStyle}>
            {player.name} - Score: {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

function IndianPlayers() {
  const allPlayers = ["Player A", "Player B", "Player C", "Player D"];
  const [player1, player2, player3, player4] = allPlayers;

  const T20players = ["Virat Kohli", "Rohit Sharma", "KL Rahul"];
  const RanjiTrophyplayers = [
    "Mayank Agarwal",
    "Priyank Panchal",
    "Abhimanyu Easwaran",
  ];
  const mergedPlayers = [...T20players, ...RanjiTrophyplayers];

  const sectionStyle = { marginBottom: "20px" };
  const listStyle = { listStyleType: "disc", paddingLeft: "20px" };

  return (
    <div>
      <div style={sectionStyle}>
        <h2>Odd/Even Team Players (Destructuring)</h2>
        <h3>Odd Team</h3>
        <ul style={listStyle}>
          <li>{player1}</li>
          <li>{player3}</li>
        </ul>
        <h3>Even Team</h3>
        <ul style={listStyle}>
          <li>{player2}</li>
          <li>{player4}</li>
        </ul>
      </div>

      <div style={sectionStyle}>
        <h2>Merged T20 and Ranji Trophy Players</h2>
        <ul style={listStyle}>
          {mergedPlayers.map((player, index) => (
            <li key={index}>{player}</li>
          ))}
        </ul>
      </div>
    </div>
  );
}

function CricketApp() {
  const flag = false;

  const appStyle = {
    fontFamily: "Arial, sans-serif",
    padding: "20px",
    margin: "0 auto",
    maxWidth: "800px",
    border: "1px solid #ccc",
    borderRadius: "10px",
    boxShadow: "0 2px 5px rgba(0,0,0,0.1)",
  };

  const headerStyle = {
    textAlign: "center",
    color: "#007BFF",
    borderBottom: "2px solid #eee",
    paddingBottom: "10px",
  };

  return (
    <div style={appStyle}>
      <h1 style={headerStyle}>Cricket App Dashboard</h1>
      {flag ? <ListOfPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default CricketApp;
