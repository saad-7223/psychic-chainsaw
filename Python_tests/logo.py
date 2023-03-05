alp=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']

text = input("Enter your text : ").lower()
flag=True

def encode(t,s):
    new_t=""
    for letter in t:
        if letter not in ['!','@','#','$','&','%','*',' ']:
            new_t+=alp[abs(alp.index(letter)+s)]
        else:
            new_t+=letter
    return new_t
    
def decode(t,s):
    new_t=""
    for letter in t:
        if letter not in ['!','@','#','$','&','%','*',' ']:
            new_t+=alp[abs(alp.index(letter)-s)]
        else:    
            new_t+=letter
    return new_t
    
while(flag):
    print("\n\n1. encode \n2. decode \n3. new text \n4. exit")
    opt=int(input("\nEnter your choice : "))
    
    if opt == 1:
        shift=int(input("enter the shift : "))
        shift %= 26 
        e=encode(text,shift)
        print(f"\nENCODED TEXT : {e}")
    
    elif opt==2:
        shift=int(input("enter the shift : "))
        shift %= 26
        print(f"\nDECODED TEXT : {decode(e,shift)}")
    
    elif opt==3:
        x=input("Enter the new text : ")
        text=x
    
    elif opt == 4:
        flag=False
        
    else:
        print("Wrong input !!")
        flag = False
