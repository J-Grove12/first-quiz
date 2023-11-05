class Oven:
  def __init__(self):
      self.ingredients = []
      self.temperature = 0

  def add(self, item):
      self.ingredients.append(item)

  def freeze(self):
    self.temperature = -1 

  def boil(self):
    self.temperature = 100  
    
  def wait(self):
    self.temperature = 0  
    
  def get_output(self):
    if self.temperature >= 100 and "lead" in self.ingredients and "mercury" in self.ingredients:
        return "gold"
    elif self.temperature < 0 and "water" in self.ingredients and "air" in self.ingredients:
        return "snow"
    elif "cheese" in self.ingredients and "dough" in self.ingredients and "tomato" in self.ingredients:
        return "pizza"

