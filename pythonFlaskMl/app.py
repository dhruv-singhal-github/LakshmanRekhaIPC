from flask import Flask, request, redirect, url_for, flash, jsonify
import numpy as np
import pickle as p
import json
from face_recog import F_r


app = Flask(__name__)


@app.route('/api/', methods=['POST'])
def makecalc():
    data = request.get_json()
    obj = F_r(data)
    prediction = np.array2string(obj.get_distance)
    return jsonify(prediction)

if __name__ == '__main__':
    app.run(debug=True)