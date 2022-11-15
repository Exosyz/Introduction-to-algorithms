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
}
