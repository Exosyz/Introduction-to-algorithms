fn add(a: &[i32], b: &[i32]) -> Vec<i32> {
    let mut remainder = 0;
    let mut c = vec![0; a.len() + 1];

    for i in (0..(c.capacity() - 1)).rev() {
        c[i + 1] = (a[i] + b[i] + remainder) % 2;
        remainder = (a[i] + b[i] + remainder) / 2;
    }
    c[0] = remainder;

    c
}

#[cfg(test)]
mod tests {
    #[test]
    fn insertion_sort() {
        let a = [1, 1, 1, 1];
        let b = [0, 0, 0, 1];

        assert_eq!([1, 0, 0, 0, 0], super::add(&a, &b).as_slice());
    }
}
