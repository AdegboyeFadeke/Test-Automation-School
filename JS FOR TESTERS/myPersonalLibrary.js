 const books = {
    title: "This is Our God",
    description: "Christain book",
    numberOfPages: 400,
    author: "Chris Segun Onayinka",
    isReading: false,
    toggleReadingStatus: function(){
        if(books.isReading === true){
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