import speech_recognition as sr

AUDIO_FILE=("something.wav")

r=sr.Recognizer()

with sr.AudioFile(AUDIO_FILE) as source:
    audio=r.record(source)

try:
    print("audio file contains "+r.recognize_google(audio))
except sr.UnknownValueError:
    print("Couldnt understand audio")
except sr.RequestError:
    print("Couldnt get result")    