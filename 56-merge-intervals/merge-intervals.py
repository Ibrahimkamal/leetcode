from string import *
from re import *
from datetime import *
from collections import *
from heapq import *
from bisect import *
from copy import *
from math import *
from random import *
from statistics import *
from itertools import *
from functools import *
from operator import *
from io import *
from sys import *
from json import *
from builtins import *
import string
import re
import datetime
import collections
import heapq
import bisect
import copy
import math
import random
import statistics
import itertools
import functools
import operator
import io
import sys
import json
from typing import *


class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class NestedInteger(object):
    def __init__(self, value=None):
        self._integer = value
        self._list = []

    def isInteger(self):
        return self._integer is not None

    def getInteger(self):
        return self._integer

    def getList(self):
        return self._list


class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        if len(intervals) <= 1:
            return intervals
        result = []
        intervals=sorted(intervals)
        i = 0
        while i < len(intervals):
            start = intervals[i][0]
            end = intervals[i][1]
            while i < len(intervals) and intervals[i][0] <= end:
                start = min(start, intervals[i][0])
                end = max(end, intervals[i][1])
                i += 1
            result.append([start, end])
        return result
