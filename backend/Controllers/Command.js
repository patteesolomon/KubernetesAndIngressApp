const express = require('express');
const router = express.Router();
const cmd = require('../models/Command.js');

// INDUCES

// Index
router.get('/', (req, res) => {
    cmd.find({}, (err, foundCommand) => {
        res.json(foundCommand);
    });
});

// New - Will be handled by React frontend application
// Delete 
router.delete('/:id', (req, res) => {
    cmd.findByIdAndDelete(req.params.id, (err, deletedCommand) => {
        res.json(deletedCommand);
    });
});

// Update
router.put('/:id', (req, res) => {
    cmd.findByIdAndUpdate(req.params.id, req.body, { new: true }, (err, updatedCommand) => {
        res.json(updatedCommand);
    });
});

// Edit - Will be handled by React Application

// Show 
router.get('/:id', (req, res) => {
    cmd.findById(req.params.id, (err, foundCmd) => {
        res.json(foundCmd);
    })
}); 

module.exports = router;