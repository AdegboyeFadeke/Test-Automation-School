#2.    Using    the    firefox    browser    navigate
#tohttps://www.google.com/  enter  the  text  Python  in
#thesearch  box,  then  send  the  Enter  key.
#Get  the  text  from  the Wikipedia  brief  on  the  right  side  and
#print  the  value  in  theconsole.

from selenium import webdriver
from selenium.webdriver.firefox.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager

def main():
    driver = webdriver.Firefox(service=Service(GeckoDriverManager().install()))
    driver.get("https://www.google.com/")
    search_bar = driver.find_element(By.ID, "APjFqb")
    search_bar.send_keys("python")
    form = driver.find_element(By.CLASS_NAME, "A8SBwf")
    form.click()
    searches = driver.find_element(By.XPATH, "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")
    searches.click()
    wiki = driver.find_element(By.XPATH, "//span[contains(text(),'Python is a high-level, general-purpose programmin')]")
    print(wiki.text)
    driver.close()

if __name__ == '__main__':
    main()
