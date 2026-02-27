# Step 1: Import library
from sklearn.linear_model import LinearRegression
import numpy as np

# Step 2: Training data (Input and Output)
X = np.array([[1], [2], [3], [4]])   # Hours studied
y = np.array([35, 50, 65, 80])       # Marks scored

# Step 3: Create model
model = LinearRegression()

# Step 4: Train model
model.fit(X, y)

# Step 5: Predict
hours = np.array([[5]])
prediction = model.predict(hours)

print("Predicted marks for 5 hours study:", prediction[0])