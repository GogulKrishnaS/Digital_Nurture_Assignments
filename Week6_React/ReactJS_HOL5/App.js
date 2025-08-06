import React from "react";

const styles = {
  box: {
    width: "300px",
    display: "inline-block",
    margin: "10px",
    padding: "10px 20px",
    border: "1px solid black",
    borderRadius: "10px",
    fontFamily: "sans-serif",
    verticalAlign: "top",
    textAlign: "left",
    backgroundColor: "#f9f9f9",
    boxShadow: "0 2px 4px rgba(0,0,0,0.1)",
  },
  dtStyle: {
    fontWeight: "500",
    color: "#333",
  },
  ddStyle: {
    margin: "0 0 10px 0",
    color: "#666",
  },
};

class CohortDetails extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      cohorts: [
        {
          id: 1,
          name: "React Fundamentals",
          organizer: "John Doe",
          venue: "Online",
          status: "ongoing",
        },
        {
          id: 2,
          name: "Advanced Angular",
          organizer: "Jane Smith",
          venue: "Chennai",
          status: "completed",
        },
        {
          id: 3,
          name: "Vue for Beginners",
          organizer: "Peter Jones",
          venue: "Online",
          status: "ongoing",
        },
        {
          id: 4,
          name: "Node.js Backend",
          organizer: "Mary Brown",
          venue: "Bangalore",
          status: "completed",
        },
      ],
    };
  }

  render() {
    const { cohorts } = this.state;

    return (
      <div>
        {cohorts.map((cohort) => {
          const statusStyle = {
            color: cohort.status === "ongoing" ? "green" : "blue",
            borderBottom: "1px solid #eee",
            paddingBottom: "5px",
            marginBottom: "10px",
          };

          return (
            <div key={cohort.id} style={styles.box}>
              <h3 style={statusStyle}>{cohort.name}</h3>
              <dl>
                <dt style={styles.dtStyle}>Organizer</dt>
                <dd style={styles.ddStyle}>{cohort.organizer}</dd>

                <dt style={styles.dtStyle}>Venue</dt>
                <dd style={styles.ddStyle}>{cohort.venue}</dd>

                <dt style={styles.dtStyle}>Status</dt>
                <dd style={styles.ddStyle}>{cohort.status}</dd>
              </dl>
            </div>
          );
        })}
      </div>
    );
  }
}

function App() {
  const appStyle = {
    textAlign: "center",
    padding: "20px",
  };

  return (
    <div style={appStyle}>
      <h1>Cognizant Academy Cohort Dashboard</h1>
      <CohortDetails />
    </div>
  );
}

export default App;
