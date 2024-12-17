class Solution:
    def repeatLimitedString(self, s: str, limit: int) -> str:
        heap = [ (-ord(ch), ch, count) for ch, count in Counter(s).items() ]
        heapify(heap)
        res, count = [], 0

        while heap:
            max_heap_key, ch, rem = heappop(heap)
            if res and res[-1] == ch and (count+1) > limit:
                if not heap: break
                max_heap_key2, ch2, rem2 = heappop(heap)
                heappush(heap, (max_heap_key, ch, rem))
                max_heap_key, ch, rem = max_heap_key2, ch2, rem2

            if res and res[-1] != ch:
                count = 0

            res.append(ch)
            rem -= 1
            if rem:
                heappush(heap, (max_heap_key, ch, rem))
            count += 1
        return ''.join(res)           