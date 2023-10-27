#4. Navigate to https://www.bbc.com/  and  print  out  thetop 10 latest news
#from the home page.

from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager

def main():
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    driver.get("https://www.bbc.com/")
    homepage = driver.find_element(By.ID, "page-title")
    print("This is the homepage ", homepage.text)
    section = driver.find_element(By.ID, "page")
    news = section.find_element(By.CLASS_NAME, "module__content")
    print(news.text)

    driver.close()


if __name__ == '__main__':
    main()