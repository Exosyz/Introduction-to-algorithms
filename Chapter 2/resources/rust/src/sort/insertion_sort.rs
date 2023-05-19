use crate::search::binary_search::rec_find_position;

fn insertion_sort(array: &mut [i32]) {
    for i in 1..array.len() {
        let mut current_index = i;
        while current_index > 0 && array[current_index] < array[current_index - 1] {
            array.swap(current_index, current_index - 1);
            current_index -= 1;
        }
    }
}

fn reverse_insertion_sort(array: &mut [i32]) {
    for i in 1..array.len() {
        let mut current_index = i;
        while current_index > 0 && array[current_index] > array[current_index - 1] {
            array.swap(current_index, current_index - 1);
            current_index -= 1;
        }
    }
}

fn rec_insertion_sort(array: &mut [i32], n: usize) {
    if n <= 1 {
        return;
    }

    rec_insertion_sort(array, n - 1);

    let current = array[n - 1];
    let mut i = n - 2;
    let mut flag = false;

    while !flag && array[i] > current {
        array[i + 1] = array[i];
        if i > 0 {
            i -= 1;
        } else {
            flag = true
        }
    }
    if !flag {
        i += 1
    }

    array[i] = current
}

fn insertion_sort_with_binary_search(array: &mut [i32]) {
    for i in 1..array.len() {
        let current_value = array[i];
        let pos = rec_find_position(array,0, i-1,current_value);

        for j in (pos..i).rev() {
            array.swap(j, j+1);
        }
        array[pos] = current_value
    }
}

#[cfg(test)]
mod tests {
    #[test]
    fn insertion_sort() {
        let mut array = [31, 41, 59, 26, 41, 58];
        super::insertion_sort(&mut array);
        assert_eq!([26, 31, 41, 41, 58, 59], array);
    }

    #[test]
    fn reverse_insertion_sort() {
        let mut array = [31, 41, 59, 26, 41, 58];
        super::reverse_insertion_sort(&mut array);
        assert_eq!([59, 58, 41, 41, 31, 26], array);
    }

    #[test]
    fn rec_insertion_sort() {
        let mut array = [31, 41, 59, 26, 41, 58];
        let len = array.len();
        println!("{} : {:?}", 0, array);
        super::rec_insertion_sort(&mut array, len);
        assert_eq!([26, 31, 41, 41, 58, 59], array);
    }

    #[test]
    fn insertion_sort_with_binary_search() {
        let mut array = [31, 41, 59, 26, 41, 58];
        super::insertion_sort_with_binary_search(&mut array);
        assert_eq!([26, 31, 41, 41, 58, 59], array);
    }
}
