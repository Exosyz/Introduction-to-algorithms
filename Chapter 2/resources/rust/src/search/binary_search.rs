fn find(array: &[i32], search_value: i32) -> Option<usize> {
    rec_find(array, 0, array.len() - 1, search_value)
}

fn rec_find(array: &[i32], head: usize, tail: usize, search_value: i32) -> Option<usize> {
    if head > tail {
        return None
    }

    let mid = head + (tail - head) / 2;

    return if array[mid] == search_value {
        Some(mid)
    } else if array[mid] > search_value {
        rec_find(array, head, mid - 1, search_value)
    } else {
        rec_find(array, mid + 1, tail, search_value)
    }
}

fn find_position(array: &[i32], search_value: i32) -> usize {
    rec_find_position(array, 0, array.len(), search_value)
}

pub fn rec_find_position(array: &[i32], mut head: usize, mut tail: usize, search_value: i32) -> usize {
    while head <= tail {
        let mid = (head + tail) / 2;
        if array[mid] == search_value {
            return mid;
        } else if array[mid] < search_value {
            head = mid + 1;
        } else {
            if mid == 0 {
                return 0;
            }
            tail = mid - 1;
        }
    }
    return head;
}

#[cfg(test)]
mod tests {
    #[test]
    fn find() {
        let mut array = [26, 31, 41, 58, 59];

        assert_eq!(Some(4), super::find(&mut array, 59));
        assert_eq!(None, super::find(&mut array, 40));
    }

    #[test]
    fn find_position() {
        let mut array = [26, 31, 41, 58, 59];

        assert_eq!(4, super::find_position(&mut array, 59));
        assert_eq!(2, super::find_position(&mut array, 40));
    }
}
