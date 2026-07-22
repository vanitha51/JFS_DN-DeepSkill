function BookDetails() {

    const showBooks = true;

    let content;

    if(showBooks){

        content = (
            <div className="card">
                <h2>Book Details</h2>

                <ul>
                    <li>React in Action</li>
                    <li>Java Complete Reference</li>
                    <li>Python Crash Course</li>
                </ul>

            </div>
        );

    }

    else{

        content = <h3>No Books Available</h3>;

    }

    return content;
}

export default BookDetails;