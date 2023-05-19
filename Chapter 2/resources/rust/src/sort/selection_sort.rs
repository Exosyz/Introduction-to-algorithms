fn selection_sort(array: &mut [i32]) {
    for i in 0..(array.len() - 1) {
        let mut smallest_index = i;

        for j in i..array.len() {
            if array[j] < array[smallest_index] {
                smallest_index = j;
            }
        }

        let swap = array[smallest_index];
        array[smallest_index] = array[i];
        array[i] = swap;
    }
}

#[cfg(test)]
mod tests {
    #[test]
    fn selection_sort() {
        let mut array = [31, 41, 59, 26, 41, 58];
        super::selection_sort(&mut array);
        assert_eq!([26, 31, 41, 41, 58, 59], array);
    }
}
