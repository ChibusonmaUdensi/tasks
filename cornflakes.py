    
price = float(input("Enter the price of the product: "))
discount = int(input("Enter the discount percentage: "))
discounted_price = price - (price * discount / 100)

discounted_price = discounted_price(price, discount)
print("Price after discount ${:.2f}".format(discounted_price))

if _name_ == "_main_":
    main()