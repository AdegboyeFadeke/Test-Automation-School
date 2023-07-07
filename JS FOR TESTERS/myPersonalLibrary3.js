const myPersonalLibrary= {
    name: "Fadeke Adegboye",
    books: [
        {
            title: "This is Our God",
            description: "Christain book",
            numberOfPages: 400,
            author: "Chris Segun Onayinka",
            isReading: false,
        },
        {
            title: "This is Our God, His Wrath",
            description: "Christain book",
            numberOfPages: 1200,
            author: "Chris Segun Onayinka",
            isReading: false,
        },
        {
            title: "Build to last",
            description: "Christain book",
            numberOfPages: 200,
            author: "Chris Segun Onayinka",
            isReading: false,
        },
        {
            title: "How to be a blessing to your Local Church",
            description: "Christain book",
            numberOfPages: 300,
            author: "Chris Segun Onayinka",
            isReading: false,
        },
        {
            title: "What Next After Salvation",
            description: "Christain book",
            numberOfPages: 208,
            author: "Chris Segun Onayinka",
             isReading: true,
        },
        {
            title: "Honor",
            description: "Christain book",
            numberOfPages: 500,
            author: "Candance Camp",
            isReading: false,
        },
        {
            title: "Dream Big",
            description: "Inspirational story",
            numberOfPages: 400,
            author: "Ben Carson",
            isReading: false,
        }
    ],
    
    toggleReadingStatus: function(){
        for(let myPersonalLibrary.books.isReading === true){
            books.isReading = false
        }else {
            books.isReading = true
        }
    }
 }

//  console.log(books['author']);
//  console.log(books['numberOfPages']);
//  console.log(books['description']);
//  console.log(books['title']);
books.toggleReadingStatus()
 console.log(books.isReading);