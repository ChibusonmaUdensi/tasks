def calculate_rider_payment():
    base_pay = 5000
    amount_per_parcel = 500

    successful_deliveries = int(input("Enter the number of successful deliveries: "))

    if successful_deliveries < 50:
        commission_amount = 160
    elif 50 <= successful_deliveries <= 59:
        commission_amount = 200
    elif 60 <= successful_deliveries <= 69:
        commission_amount = 250
    else:
        commission_amount = 500

    
    commission = successful_deliveries * commission_amount
    total_wage = commission + base_pay

    return total_wage

print(calculate_rider_payment())