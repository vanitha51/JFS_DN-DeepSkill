function BlogDetails() {

    const isLoggedIn = true;

    const hasBlogs = true;

    return (

        <div className="card">

            <h2>Blog Details</h2>

            {
                isLoggedIn ?

                (
                    hasBlogs &&

                    <ul>
                        <li>Understanding React Hooks</li>
                        <li>Getting Started with Vite</li>
                        <li>JavaScript ES6 Features</li>
                    </ul>

                )

                :

                <h3>Please Login to View Blogs</h3>

            }

        </div>

    );

}

export default BlogDetails;