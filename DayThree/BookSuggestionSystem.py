import random
books = []

books.extend(["the habbit","Rich Dad Poor Dad", "the alchemist"])

def suggest_books():
    while true:
        print("Suggested book")
        random_book = random.choice(books)
        random_page = random.randint(1,101)

        print("Title: ", random_book)
        print("Page number: ", random_page)

        choice = input("would you like anither suggestion? ")
        if(choice.lower() != "yes"):
            break

def add_books():
    title = input("enter the title of the book")
    if(title not in books):
        books.append(title)
        return "Added Successfully"        
    else:
        return "Already exist"

def remove_books():
     title = input("enter the title of the book")
     if(title in books):
        books.remove(title)
        return "removed Successfully"        
     else:
        return "book not found"

def update_books():
    old_title = input("enter the old title of the book")
    if(old_title in books):
        books.remove(old_title)
        return "removed Successfully" 
    new_title = input("enter the old title of the book")       
    books.append(new_title)
    return "updated Successfully"

def show_books():
    for count in range(len(books)): 
        print(count+1, books[count])

def display_menu():
     print("""
        Welcome to the Book Suggestion System!
                1. Get Suggestions
                2. Add Book
                3. Remove Book
                4. Update book
                5. Show all books
                Enter an operation:
                                    """)
operation= int(input("enter am operation"))
    
match operation:
    case 1: suggest_books()
    case 2: add_books()
    case 3: remove_books()
    case 4: update_Books()
    case 5: show_books() 
    case _: print("invalid input")       

    

        
            
