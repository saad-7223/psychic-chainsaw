import numpy as np

pollutant_data = np.loadtxt("data.csv", dtype=float, delimiter=",",
                            skiprows=1, usecols=range(1, 8))
pollutants_A = pollutant_data[:, 0:5]
pollutants_B = pollutant_data[:, 5:]

print(pollutants_A.shape)
print(pollutants_B.shape)