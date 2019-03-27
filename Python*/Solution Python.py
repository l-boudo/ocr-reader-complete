#!/usr/bin/env python
# coding: utf-8

# In[ ]:





# In[218]:


from imutils.perspective import four_point_transform
from imutils import contours
import imutils
import numpy as np
import cv2
from matplotlib import pyplot as plt
plt.rcParams["figure.figsize"] = (10,10)

original_image = cv2.imread("new/one.jpg")
original_height = original_image.shape[1]
print(image.shape[1])

image = imutils.resize(original_image, height=300)
new_height = image.shape[1]

print(image.shape[1])

factor = (int) (np.floor(original_height/new_height))

print(factor)
gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
plt.imshow(gray, cmap='gray')
blurred = cv2.GaussianBlur(gray, (5, 5), 0)
edged = cv2.Canny(blurred, 50, 200, 255)
plt.imshow(edged,cmap='gray')
#plt.imshow(erosion,cmap='gray')

# find contours in the edge map, then sort them by their
# size in descending order
cnts = cv2.findContours(edged.copy(), cv2.RETR_EXTERNAL,
	cv2.CHAIN_APPROX_SIMPLE)
cnts = imutils.grab_contours(cnts)
cnts = sorted(cnts, key=cv2.contourArea, reverse=True)
displayCnt = None
print(len(cnts[1]))
#print(cnts)
# loop over the contours
#conv=[]
#for c in cnts:
#    conv.append(cv2.convexeHull())
plt.imshow(image,cmap='gray')

for c in cnts:
	# approximate the contour
	peri = cv2.arcLength(c, True)
	#print(peri)
	approx = cv2.approxPolyDP(c, 0.05 * peri, True)
	#print("lenenen "+str(len(approx)))
	# approx = cv2.approxPolyDP(c, 0.02 * peri, True)
	# if the contour has four vertices, then we have found
	# the thermostat display
	ex=[]
	ey=[]
	for i in approx :
		ex.append(i[0][0])
		ey.append(i[0][1])
	#plt.plot(ex,ey,"x")
	if len(approx) == 4:
		displayCnt = approx
		break

#print(displayCnt)

#for i in displayCnt :
#    plt.plot(i[0][0],i[0][1],'ro')
#blurred2 = cv2.GaussianBlur(gray, (3, 3), 0)
#warped = four_point_transform(gray, displayCnt.reshape(4, 2))
#output = four_point_transform(image, displayCnt.reshape(4, 2))

displayCnt = displayCnt*factor
warpedo = four_point_transform(gray, displayCnt.reshape(4, 2))
outputo = four_point_transform(original_image, displayCnt.reshape(4, 2))
#[x,y,z] = output.shape

print (x,y)
mrg = 0
#put = output[mrg:x-mrg,mrg:y-mrg]
[x,y,z] = outputo.shape

put2 =  outputo[mrg:x-mrg,mrg:y-mrg]
#plt.imshow(image2,cmap='gray')
#plt.imshow(original_image,cmap='gray')
#plt.imshow(put2,cmap='gray')

#plt.imshow(outputo,cmap='gray')

#gray = cv2.cvtColor(put, cv2.COLOR_BGR2GRAY)
#plt.imshow(gray, cmap='gray')
#blurred = cv2.GaussianBlur(gray, (5, 5), 0)
#plt.imshow(blurred, cmap='gray')
#plt.imshow(edged,cmap='gray')

ngray = cv2.cvtColor(put2, cv2.COLOR_BGR2GRAY)
kernel = np.ones((10,10),np.uint8)

ngray = cv2.erode(ngray,kernel,iterations = 1)
blurred = cv2.GaussianBlur(ngray, (5, 5), 0)

plt.imshow(blurred,cmap='gray')


thresh = cv2.threshold(blurred, 0, 255,cv2.THRESH_BINARY_INV | cv2.THRESH_OTSU)[1]
kernel = cv2.getStructuringElement(cv2.MORPH_ELLIPSE, (1, 5))
thresh = cv2.morphologyEx(thresh, cv2.MORPH_OPEN, kernel)
kernel = np.ones((10,10),np.uint8)

thresh = cv2.dilate(thresh,kernel,iterations = 1)

plt.imshow(thresh,cmap='gray')

