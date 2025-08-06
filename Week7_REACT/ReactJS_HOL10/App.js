import React from "react";

function OfficeSpaceApp() {
  const officeSpaces = [
    {
      id: 1,
      name: "Modern Downtown Loft",
      rent: 75000,
      address: "123 Business Rd, Metro City",
      imageUrl: "https://placehold.co/400x250/a2d2ff/ffffff?text=Modern+Loft",
    },
    {
      id: 2,
      name: "Cozy Suburban Suite",
      rent: 55000,
      address: "456 Suburb Ave, Townsville",
      imageUrl:
        "https://placehold.co/400x250/bde0fe/ffffff?text=Suburban+Suite",
    },
    {
      id: 3,
      name: "Tech Park Hub",
      rent: 90000,
      address: "789 Innovation Dr, Tech Park",
      imageUrl: "https://placehold.co/400x250/ffafcc/ffffff?text=Tech+Hub",
    },
    {
      id: 4,
      name: "Affordable Startup Space",
      rent: 48000,
      address: "101 Garage St, Startup Alley",
      imageUrl: "https://placehold.co/400x250/a2d2ff/ffffff?text=Startup+Space",
    },
  ];

  const appStyle = {
    fontFamily: "Arial, sans-serif",
    padding: "20px",
    backgroundColor: "#f4f7f6",
  };

  const headerStyle = {
    textAlign: "center",
    color: "#333",
    borderBottom: "2px solid #ddd",
    paddingBottom: "15px",
    marginBottom: "30px",
  };

  const listContainerStyle = {
    display: "flex",
    flexWrap: "wrap",
    justifyContent: "center",
    gap: "20px",
  };

  const cardStyle = {
    border: "1px solid #ddd",
    borderRadius: "10px",
    padding: "20px",
    width: "350px",
    boxShadow: "0 4px 8px rgba(0,0,0,0.1)",
    backgroundColor: "white",
    textAlign: "left",
  };

  const imageStyle = {
    width: "100%",
    height: "auto",
    borderRadius: "8px",
    marginBottom: "15px",
  };

  const getRentStyle = (rent) => {
    return {
      fontWeight: "bold",
      color: rent >= 60000 ? "green" : "red",
    };
  };

  return (
    <div style={appStyle}>
      <h1 style={headerStyle}>Available Office Spaces</h1>

      <div style={listContainerStyle}>
        {officeSpaces.map((office) => (
          <div key={office.id} style={cardStyle}>
            <img
              src={office.imageUrl}
              alt={`View of ${office.name}`}
              style={imageStyle}
              onError={(e) => {
                e.target.onerror = null;
                e.target.src =
                  "https://placehold.co/400x250/cccccc/ffffff?text=Image+Not+Found";
              }}
            />
            <h2>{office.name}</h2>
            <p>
              <strong>Address:</strong> {office.address}
            </p>
            <p>
              <strong>Rent:</strong>
              <span style={getRentStyle(office.rent)}>
                ₹{office.rent.toLocaleString()} / month
              </span>
            </p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default OfficeSpaceApp;
