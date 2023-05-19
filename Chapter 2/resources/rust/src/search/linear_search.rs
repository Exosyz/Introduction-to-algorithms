fn find(array: &[i32], search_value: i32) -> Option<usize> {
    for i in 0..array.len() {
        if array[i] == search_value {
            return Some(i);
        }
    }
    None
}

#[cfg(test)]
mod tests {
    #[test]
    fn insertion_sort() {
        let mut array = [31, 41, 59, 26, 41, 58];

        assert_eq!(Some(2), super::find(&mut array, 59));
        assert_eq!(None, super::find(&mut array, 40));
    }
}
