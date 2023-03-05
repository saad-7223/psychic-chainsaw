word = input("Enter a word : ")
flag = True
while(flag):
    print("1. encode")
    print("2. decode")
    print("3. Exit")
    ch = int(input("Enter your choice : "))
    x=[]
    def s_plit(word):
        for letter in word:
            x.append(letter)
    def encode(x):
        shift = int(input("Enter shift by : "))
        new_word= ""
        for i in x:
            new_word+=chr(ord(i)+shift)
        return new_word 
    def decode(x):
        shift = int(input("Enter shift by : "))
        new_word= ""
        for i in x:
            new_word+=chr(ord(i)-shift)
        return new_word        
        
    if ch == 1:
        s_plit(word)
        print(f"Encoded word : {encode(x)}")
    elif ch == 2:
        s_plit(word)
        print(f"Decoded word : {decode(x)}")
    else:
        flag = False   
