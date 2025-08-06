import React from "react";

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null,
    };
  }

  componentDidMount() {
    this.loadPosts();
  }

  loadPosts = async () => {
    try {
      const response = await fetch(
        "https://jsonplaceholder.typicode.com/posts"
      );
      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      const data = await response.json();
      this.setState({ posts: data });
    } catch (e) {
      console.error("Failed to fetch posts:", e);
      this.setState({ error: e });
    }
  };

  render() {
    const { posts, error } = this.state;

    if (error) {
      return <div>Error loading posts: {error.message}</div>;
    }

    if (posts.length === 0) {
      return <div>Loading posts...</div>;
    }

    return (
      <div style={{ fontFamily: "sans-serif", padding: "20px" }}>
        <h1 style={{ borderBottom: "2px solid #eee", paddingBottom: "10px" }}>
          Blog Posts
        </h1>
        {posts.map((post) => (
          <div
            key={post.id}
            style={{
              border: "1px solid #ddd",
              padding: "15px",
              margin: "15px 0",
              borderRadius: "8px",
            }}
          >
            <h2 style={{ color: "#333" }}>{post.title}</h2>
            <p style={{ color: "#666" }}>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

function App() {
  return (
    <div>
      <Posts />
    </div>
  );
}

export default App;
