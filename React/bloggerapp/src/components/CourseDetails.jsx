function CourseDetails() {

    const course = "React";

    return (

        <div className="card">

            <h2>Course Details</h2>

            {

                (() => {

                    switch(course){

                        case "React":

                            return (

                                <ul>
                                    <li>React Fundamentals</li>
                                    <li>React Components</li>
                                    <li>React Routing</li>
                                </ul>

                            );

                        case "Java":

                            return (

                                <ul>
                                    <li>OOP</li>
                                    <li>Collections</li>
                                    <li>JDBC</li>
                                </ul>

                            );

                        default:

                            return <h3>No Course Found</h3>;

                    }

                })()

            }

        </div>

    );

}

export default CourseDetails;