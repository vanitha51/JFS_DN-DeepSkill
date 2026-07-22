import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";
import "./App.css";

function App() {
  return (
    <div className="container">
      <h1>Blogger Application</h1>

      <BookDetails />

      <BlogDetails />

      <CourseDetails />
    </div>
  );
}

export default App;