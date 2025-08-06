import React, { useState } from "react";

function BookDetails() {
  return (
    <div style={{ padding: "20px", backgroundColor: "#e3f2fd" }}>
      <h2>Book Details</h2>
      <p>This section contains details about various books.</p>
    </div>
  );
}

function BlogDetails() {
  return (
    <div style={{ padding: "20px", backgroundColor: "#e8f5e9" }}>
      <h2>Blog Details</h2>
      <p>Here you can find the latest blog posts.</p>
    </div>
  );
}

function CourseDetails() {
  return (
    <div style={{ padding: "20px", backgroundColor: "#f3e5f5" }}>
      <h2>Course Details</h2>
      <p>Information about available courses is listed here.</p>
    </div>
  );
}

function BloggerApp() {
  const [view, setView] = useState("none");

  const renderComponentWithSwitch = () => {
    switch (view) {
      case "book":
        return <BookDetails />;
      case "blog":
        return <BlogDetails />;
      case "course":
        return <CourseDetails />;
      default:
        return <p>Please select a view to see details.</p>;
    }
  };

  const appStyle = {
    fontFamily: "Arial, sans-serif",
    textAlign: "center",
    maxWidth: "700px",
    margin: "20px auto",
    boxShadow: "0 4px 12px rgba(0,0,0,0.1)",
    borderRadius: "10px",
    overflow: "hidden",
  };

  const headerStyle = {
    backgroundColor: "#673ab7",
    color: "white",
    padding: "20px",
  };

  const navStyle = {
    padding: "15px",
    backgroundColor: "#f1f1f1",
    borderBottom: "1px solid #ddd",
  };

  const buttonStyle = {
    margin: "0 10px",
    padding: "10px 20px",
    fontSize: "16px",
    cursor: "pointer",
    border: "1px solid #ccc",
    borderRadius: "5px",
  };

  const contentStyle = {
    padding: "20px",
  };

  return (
    <div style={appStyle}>
      <div style={headerStyle}>
        <h1>Blogger Dashboard</h1>
      </div>
      <div style={navStyle}>
        <button style={buttonStyle} onClick={() => setView("book")}>
          Show Books
        </button>
        <button style={buttonStyle} onClick={() => setView("blog")}>
          Show Blogs
        </button>
        <button style={buttonStyle} onClick={() => setView("course")}>
          Show Courses
        </button>
        <button style={buttonStyle} onClick={() => setView("none")}>
          Clear
        </button>
      </div>

      <div style={contentStyle}>{renderComponentWithSwitch()}</div>

      <div style={contentStyle}>
        {view === "book" ? <BookDetails /> : <p>Book details are hidden.</p>}
      </div>

      <div style={contentStyle}>
        {view === "blog" && <BlogDetails />}
        {view !== "blog" && <p>Blog details are hidden.</p>}
      </div>
    </div>
  );
}

export default BloggerApp;
