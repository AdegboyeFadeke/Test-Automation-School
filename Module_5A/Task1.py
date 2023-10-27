# Using    the    chrome    browser    navigate
# to https://www.facebook.com/ fill  in  the  email/phone
# and password text box then click the Login Button.

from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager

def main():
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    driver.get("https://web.facebook.com/")
    form = driver.find_element(By.TAG_NAME, "form")
    email = form.find_element(By.ID, "email")
    email.send_keys("thetester@email.com")
    password = form.find_element(By.ID, "pass")
    password.send_keys("test11003344")
    submit = form.find_element(By.NAME, "login")
    submit.click()
    driver.close()


if __name__ == '__main__':
    main()
