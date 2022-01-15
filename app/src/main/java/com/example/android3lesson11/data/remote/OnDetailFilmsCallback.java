package com.example.android3lesson11.data.remote;

import com.example.android3lesson11.data.models.Film;

public interface OnDetailFilmsCallback {
    void success(Film film);
    void serverError();
    void failure(String msg);
}
