import insightface
import urllib
import urllib.request
import numpy as np
from matplotlib import pyplot
from matplotlib.patches import Rectangle
import face_recognition as fr
import cv2
import math
import os
from PIL import Image
from statistics import mean



class F_r(object):

  def __init__(self, probe_img, gallery):
    self.probe_img = probe_img
    self.gallery = gallery


  def image_matching(self, photo):
    probe = np.asarray(Image.open(self.probe_img))
    probe_encoding = self.get_face_encoding(probe)
    return fr.face_distance(probe_encoding, photo)


  def get_face_encoding(self, img_array):
    retinaface_model = insightface.model_zoo.get_model('retinaface_r50_v1')
    retinaface_model.prepare(ctx_id = -1, nms=0.4)
    arcface_model = insightface.model_zoo.get_model('arcface_r100_v1')
    arcface_model.prepare(ctx_id = -1)
    bbox, landmark = retinaface_model.detect(img_array, threshold=0.5, scale=1.0)
    landmark = np.reshape(landmark, (5,2))
    img = insightface.utils.face_align.norm_crop(img_array, landmark)
    encoding = arcface_model.get_embedding(img)
    return encoding


  def get_distance(self):
    imgs = [Image.open(x) for x in self.gallery]
    gallery_imgs = list(map(np.asarray, imgs))
    gallery_encoding = list(map(self.get_face_encoding, gallery_imgs))
    distances = list(map(self.image_matching, gallery_encoding))
    distance = sum(distances)/len(distances)
    return distance[0]